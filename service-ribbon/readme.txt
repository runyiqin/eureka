server.port=2222

spring.application.name=eureka-ribbon
eureka.client.service-url.defaultZone=http://localhost:1111/eureka

#   ribbon 重试机制
#   spring.cloud.loadbalancer.retry.enabled=true 开启重试机制
#   hystrix.command.default.execution.isolation.thread.timeoutInMilliseconds=10000 断路器的超时时间要大于Ribbon的超时时间，不然不会触发重试
#   ribbon.ConnectTimeout=250 请求连接的超时时间
#   ribbon.ReadTimeout=1000 请求处理的超时时间
#   ribbon.OkToRetryOnAllOperations=true 对所有请求都进行重试操作
#   ribbon.MaxAutoRetriesNextServer=2   切换实例的重试次数
#   ribbon.MaxAutoRetries=1 对当前实例的重试次数
#   以上配置是针对全局配置，如果针对实例进行配置，以${spring.appliation.name}开头进行设置
#   例如：hello-server.ribbon.ConnectTimeout=100
#   根据以上配置，当访问到故障请求的时候，他会尝试访问当前实例（次数由MaxAutoRetries配置），如果不行，切换其他实例进行访问
#   如果不行，再换一个实例进行访问（切换实例的次数由MaxAutoRetriesNextServer来配置），如果还不行就返回失败。
#
#   测试超时：int sleep = new Random().nexInt(300); new Thread().sleep(sleep);
#
#

