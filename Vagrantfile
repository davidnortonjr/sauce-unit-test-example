# -*- mode: ruby -*-
# vi: set ft=ruby :

Vagrant::Config.run do |config|
   config.vm.box = "precise64"

  config.vm.forward_port 9099, 9099

  config.vm.share_folder "sauce-unit-test-src", "/opt/sauce-unit-test", "./"

  config.vm.provision :chef_solo do |chef|
    chef.add_recipe('java')
    chef.add_recipe('sauce-unit-test')
  end

end
