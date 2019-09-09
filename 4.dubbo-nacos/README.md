# dubbo-nacos
dubbo 使用 nacos 作为注册中心

## 环境准备
> [] 中为服务启动的端口

1. nacos[8848]
2. provider[8081]
3. consumer[8082]

## 启动顺序
启动 DubboProviderApplication 前需要先启动 nacos。
1. com.github.mgzu.provider.DubboProviderApplication
2. com.github.mgzu.consumer.DubboConsumerApplication

## 存在问题
* provider 注册时会警告