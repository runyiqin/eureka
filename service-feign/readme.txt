server.port=3333

#由于spring cloud feign的客户端负载均衡是通过spring cloud ribbon来实现的，
#在项目中配置ribbon的参数,使用ribbon.<key>=<value>的方式来设置ribbon的参数
# 全局配置
#   ribbon.ConnectTimeout=500
#   ribbon.ReadTimeout=5000
#指定服务配置 使用feign的时候配置的client名称用来进行配置
#   <server-name>.ribbon.<key>=<value>
#
#在feign中的hystrix配置 对hystrix的配置跟ribbon中的配置一样，直接使用它的默认配置前缀
#    hystrix.command.default即可进行配置
#   全局配置
#       hystrix.command.default.execution.isolation.thread.timeoutInMillseconds=5000 全局超时时间
#       feign.hystrix.enabled=false 关闭hystrix功能
#       hystrix.command.default.execution.timeout.enable=false 关闭熔断功能
#   指定配置 采用hystrix.command.<commandKeh>作为前缀。commandkey默认情况下采用feign客户端中的方法名作为标识
#       例如：hystrix.command.eurekaribbon.default.execution.isolation.thread.timeoutInMillseconds=5000
#
# 请求压缩 spring cloud feign支持对请求和相应进行GZIP压缩，以减少通信中的性能损耗。
#       feign.compression.request.enabled=true 开启请求压缩
#       feign.compression.response.enabled=true 开启相应压缩
#       feign.compression.request.mime-types 指定压缩的请求的数据类型，默认的参数：text/xml,application/xml,application/json
#       feign.compression.request.min-request-size 设置压缩的大小下限，超过这大小的参数才会进行压缩，默认参数：2048
#
#日志配置 spring cloud feign在构建被@FeignClient注解修饰的客户端时，会为每个客户端都创建一个feign.logger实例，
#      可以利用该日志对象的DEBUG模式来进行feign的细节分析。使用logging.level.<feignclieng>的参数配置来开启指定
#       feign客户端的DEBUG日志。例如：logging.level.com.example.demo.HelloService=DEBUG
#       在添加配置后需要定义Logging.level的对象的级别，默认为NONE。
#       全局配置，在Applicatin文件中设置Logger.level的Bean配置。
#       局部配置，定义configation，在定义feignClient的时候设置configation。
#       feign的logger的级别有四种：
#           NONE:不记录任何信息
#           BASIC:仅记录请求方法，URL以及相应状态码和执行时间
#           HEADERS:除了记录BASIC级别的信息外，还会记录请求和相应的头信息
#           FULL:记录所有请求和响应的明细，包括头信息，请求体，元数据等。

