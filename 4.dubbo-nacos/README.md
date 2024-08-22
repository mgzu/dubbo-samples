# dubbo-nacos

dubbo 使用 nacos 作为注册中心

## 环境准备

| 框架/软件       | 版本    |
|-------------|-------|
| double      | 3.2.4 |
| spring-boot | 3.1.1 |
| jdk         | 21    |
| nacos       | 2.2.4 |

## 启动顺序

1. nacos[8848]
2. provider[8081]
3. consumer[8082]

> 序号为启动顺序，[] 中为服务端口

启动 nacos

```
// windows
startup.cmd -m standalone
// *unix
startup.sh -m standalone
```

启动 DubboProviderApplication 前需要先启动 nacos。

1. com.github.mgzu.provider.DubboProviderApplication
2. com.github.mgzu.consumer.DubboConsumerApplication

## 存在问题

* consumer、provider 启动时会有 WARN 日志
