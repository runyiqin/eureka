#zuul.routes 路由配置
#   传统路由配置：将服务/hello/**规则的访问都将被路由转发到http://localhost:8080/地址上
#       zuul.routes.hello-url.path=/hello/**
#       zuul.routes.hello-url.url=http://localhost:8080/
#   面向服务的路由：将服务/hello/**规则的访问都被路由到helloService客户端上
#       zuul.routes.hello-url.path=/hello/**
#       zuul.routes.hello-url.serviceId=helloService
#   hystrix.command.default.execution.isolation.thread.timeoutInMilliseconds API路由网关转发请求的hystrixCommand执行的超时时间，
#       当超过这个时间的时候，hystrix会标记为TIMEOUT并抛出异常
#   ribbon.ConnectTimeout 创建路由转发请求的时候，创建请求连接的超时时间。当ConnectTimeout设置的时间小于Hystrix设置的时间
#       如果出现超时的情况，会自动进行重试路由的请求，如果重试失败，返回错误信息。
#       当ConnectTimeout的时间大于hystrix设置的时间时，当时间超过Hystrix设置的时间会，会自动返回TimeOut错误，不会进行重试
#   ribbon.ReadTimeout 设置路由转发请求的超时时间。不同于上面的connectTimeout，此超时是创建完请求之后的处理时间。如果超时
#       触发重试机制。当设置时间大于hystrix设置的时候时，直接返回Timeout错误。
#   全局关闭重试机制
#       zuul.retryable=false 全局关闭重试机制
#   局部关闭重试机制
#       zuul.routes.<route>.retryable=false 关闭指定路由的重试机制
#   禁用指定路由器
#       zuul.<SimpleClassName>.<filterType>.disable=true SimpleName代表过滤器的类名；filterType代表过滤器的类型
#           例如：zuul.AccessFilter.pre.disable=true
#
#
#



