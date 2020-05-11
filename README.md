# ec2-springboot

AWS EC2(AmazonLinux2) & SpringBoot のボイラープレートです。  

## 利用方法
```
$ cd path/to/thisproject

$ vagrant up provision
(vagrant-plugin のインストール可否を聞かれるので Y)
```

再度、
```
$ vagrant up provision
```

```
$ vagrant ssh
[vagrant]$ cd /vagrant
[vagrant]$ ./gradlew bootRun -Pdebug
Starting a Gradle Daemon (subsequent builds will be faster)

> Task :bootRun
Listening for transport dt_socket at address: 5005
```

デバッグポート5005で待ち受けに入るので、IDEなどでアタッチすればブレークポイントが貼れます。  
加えて、SpringBootの「Remote Update and Restart」機能によりホットデプロイが実現できます。  

### VSCodeの場合

本プロジェクトのWorkspaceを開く。  
左メニューのデバッグアイコンをクリック、Debug (Attach), Debug (Launch) の両方を起動します。  
※ 前者はデバッガのアタッチで、後者は「Remote Update and Restart」機能のサービス起動です。  
