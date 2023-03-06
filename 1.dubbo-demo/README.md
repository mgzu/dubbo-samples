# dubbo-demo

使用 zookeeper 作为注册中心，curator 作为客户端，需要外置的 zookeeper。

## 环境准备

| 框架/软件     | 版本           |
|-----------|--------------|
| jdk       | 17           |
| double    | 3.2.0-beta.5 |
| zookeeper | 3.8.1        |

1. zookeeper[2181]
2. provider[8081]
3. consumer[8082]

> 序号为启动顺序，[] 中为服务端口

## 启动顺序

启动 DubboProviderApplication 前，需要先启动 zookeeper。

1. com.github.mgzu.provider.Provider
2. com.github.mgzu.consumer.Consumer
