# dubbo-boot

dubbo 集成 boot

## 环境准备

| 框架/软件       | 版本           |
|-------------|--------------|
| jdk         | 17           |
| double      | 3.2.0-beta.5 |
| spring-boot | 3.0.3        |
| zookeeper   | 3.8.1        |

1. zookeeper[2181]
2. provider[8081]
3. consumer[8082]

> 序号为启动顺序，[] 中为服务端口

## 启动服务

启动 DubboProviderApplication 前，需要先启动 zookeeper。

1. com.github.mgzu.provider.DubboProviderApplication
2. com.github.mgzu.consumer.DubboConsumerApplication
