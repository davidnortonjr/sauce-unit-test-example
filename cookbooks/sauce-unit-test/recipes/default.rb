remote_file "/opt/jenkins.war" do 
	action :create_if_missing
	source "http://mirrors.jenkins-ci.org/war/latest/jenkins.war"
end

execute "java -jar /opt/jenkins.war --httpPort=9099 &" do
end

remote_file "/opt/jenkins-cli.jar" do 
	action :create_if_missing
	source "http://localhost:9099/jnlpJars/jenkins-cli.jar"
end

template "/opt/jenkins-job-config.xml" do
	source "config.xml.erb"
end

execute "java -jar /opt/jenkins-cli.jar -s http://localhost:9099/ delete-job sauce-unit-test" do
end

execute "java -jar /opt/jenkins-cli.jar -s http://localhost:9099/ create-job sauce-unit-test < /opt/jenkins-job-config.xml" do
end