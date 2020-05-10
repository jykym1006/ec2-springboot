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

    #
    # provision
    #
    # /etc/environment の配置
    webapp.vm.provision "file", source: "./provision/environment/local", destination: "/tmp/environment.local"
    webapp.vm.provision "shell", inline: <<-SHELL
      mv -f /tmp/environment.local /etc/environment
    SHELL
    # /etc/nginx/conf.d/* の配置
    webapp.vm.provision "file", source: "./provision/webapp/nginx.conf.d", destination: "/tmp/nginx.conf.d"
    webapp.vm.provision "shell", inline: <<-SHELL
      mkdir -p /etc/nginx/conf.d/
      rm -rf /etc/nginx/conf.d/*
      mv -f /tmp/nginx.conf.d/* /etc/nginx/conf.d
    SHELL
    # provisionタスク
    webapp.vm.provision "shell", path: "./provision/webapp/nginx.sh"
    webapp.vm.provision "shell", path: "./provision/webapp/localonly-openjdk.sh"
  end
end
