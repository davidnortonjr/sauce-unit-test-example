remote_file "/opt/jenkins.war" do 
	action :create_if_missing
	source "http://mirrors.jenkins-ci.org/war/latest/jenkins.war"
end

directory "/root/.jenkins/jobs" do
	recursive true
end

template "/root/.jenkins/jobs/config.xml" do
	source "config.xml.erb"
end

execute "java -jar /opt/jenkins.war --httpPort=9099 &" do
end
