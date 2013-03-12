remote_file "/opt/jenkins.war" do 
	action :create_if_missing
	source "http://mirrors.jenkins-ci.org/war/latest/jenkins.war"
end


execute "java -jar /opt/jenkins.war &" do
end
