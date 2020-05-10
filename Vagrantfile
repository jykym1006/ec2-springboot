# -*- mode: ruby -*-
# vi: set ft=ruby :

Vagrant.configure("2") do |config|
  #
  # plugins
  #
  # plugins
  config.vagrant.plugins = ["vagrant-hostmanager"]
  # hostmanager
  config.hostmanager.enabled = true
  config.hostmanager.manage_host = true
  config.hostmanager.manage_guest = true
  config.hostmanager.ignore_private_ip = false
  config.hostmanager.include_offline = true

  #
  # webappサーバ
  #
  config.vm.define "webapp" do |webapp|
    webapp.vm.box = "bento/amazonlinux-2"
    webapp.vm.hostname = "app.ec2-springboot.example.com"
    webapp.vm.network "private_network", ip: "192.168.33.10"
  end
end
