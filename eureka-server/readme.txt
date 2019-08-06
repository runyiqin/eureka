#服务name
spring.application.name=eureka-server
#服务实例的hostname
eureka.instance.hostname=localhost
#服务是否向注册中心注册作为服务，默认是ture。在单个服务情况下不需要开启，设置为false
eureka.client.register-with-eureka=false
#服务是否向注册中心获得在注册中心注册的服务信息，默认是ture。在单个服务的情况下不需要开启，设置为false
eureka.client.fetch-registry=false
#设置服务的默认注册中心地址，当时有多个服务的时候可以使用“，”隔开来进行设置
eureka.client.service-url.defaultZone=http://${eureka.instance.hostname}:${server.port}/eureka

#在spring cloud的eureka体系中主要分为服务端和客户端两种角色。服务端为注册中心，客户端为提供接口的微服务应用。
#在构建高可用注册中心后，该集群下的所有微服务应用都视为该体系下的一个微服务（Eureka客户端）。
#服务注册中心也一样，只是在高可用环境下的服务注册中心除了作为客户端外，还为集群中的其他客户端提供了服务注册功能。
#
#Eureka客户端的配置主要分为两方面：服务注册相关配置信息，包含了注册中心的地址，服务获取的间隔时间、可用区域等。
#   服务实例相关信息，包含了实例的名称、IP地址、端口号、健康检查路径等。
#Eureka服务端的配置，基本上不需要进行太多的配置。这些配置的参数大多以euraka.server作为前缀。
#   在本地测试的时候关闭保护机制，以确保注册中心将不可用的服务准确剔除：eureka.server.enable-self-preservation
#   默认为true，配置为false，即可关闭。
#常用的配置信息。服务注册类配置，这些配置信息都以eureka.client为前缀；服务实例类配置，这些配置都以eureka.client为前缀
#   eureka.client.register-with-eureka将服务注册到注册中心上，默认为true开启。当时使用单机的时候需要设置为false
#   eureka.client.fetch-registry从注册中心上获取服务，默认为true开启。当使用单机的时候需要设置为false
#   eureka.client.registry-fetch-interval-seconds从Eureka注册中心获取注册中心的间隔时间，单位为妙，默认为30s
#   eureka.client.service-url配置指定注册中心，在配置高可用注册中心集群的时候可以配置多个注册中心地址（以逗号隔开）
#   服务续约的两个重要配置
#       eureka.instance.lease-renewal-interval-in-seconds服务续约任务的调用间隔时间，默认为30s
#       eureka.instance.lease-expiration-duration-in-seconds服务的失效时间，默认为90s
#   eureka.client.enabled 启动Eureka客户端 默认为true
#   eureka.client.instance-info-replication-interval-seconds更新实例信息的变化到Eureka服务端的间隔时间 默认30s
#   在客户端启动的时候注册到Eureka注册中心的间隔，第一次初始化的时候
#       eureka.client.initial-instance-info-replication-interval-seconds初始化实例信息到Eureka服务端的间隔时间 默认40s
#   关于使用spring cloud config配合刷新更新服务端地址信息的配置
#       eureka.client.eureka-service-url-poll-interval-seconds轮询Eureka服务端地址更改的间隔，默认为300s。
#           当与spring cloud config配合动态刷新Eureka的serviceURL地址时需要关注此参数
#   Eureka-server客户端服务的配置信息
#       eureka.client.eureka-server-read-timeout-seconds读取Eureka Server信息的超时时间，默认为8s
#       eureka.client.eureka-server-connect-timeout-seconds连接Eureka Server的超时时间，默认为5s
#       eureka.client.eureka-server-total-connections从Eureka客户端到所有Eureka服务端的连接总数，默认为200
#       eureka.client.eureka-server-total-connections-per-host从Eureka客户端到每个Eureka服务端主机的连接总数，默认为50
#   eureka.client.eureka-connection-idle-timeout-seconds Eureka服务端连接的空闲关闭时间，默认为30s
#   Eureka心跳连接池配置
#       eureka.client.heartbeat-executor-thread-pool-size 心跳连接池的初始化线程数 默认为2
#       eureka.client.heartbeat-executor-exponential-back-off-bound 心跳超时重试延迟时间的最大乘数值 默认为10
#   Eureka缓存配置
#       eureka.client.cache-refresh-executor-thread-pool-size 缓存刷新线程池的初始化线程数 默认为2
#       eureka.client.cache-refresh-executor-exponential-back-off-bound 缓存刷新重试延迟时间的最大乘数值 默认为10
#   eureka.client.use-dns-for-fetching-service-urls 使用DNS来获取Eureka服务端的serviceUrl默认为false
#   eureka.client.prefer-same-zone-eureka 是否偏好使用相同Zone的Eureka服务端 默认为ture
#   eureka.client.filter-only-up-instances 获取实例是否过滤，仅保留UP状态的实例 默认为true
#   eureka.client.healthcheck.enabled 开启Eureka客户端的健康监测交给spring-boot-actuator模块的/health端点,可以在/health进行监测
#   Eureka 服务实例类信息配置
#   eureka.instance.metadata-map 针对元数据进行配置：
#       （服务实例的元数据：Eureka客户端向服务端发送注册请求时，用来描述自身服务信息的对象，其中包含了一些标准变化的元数据
#       比如服务名，实例名称，实例IP，实例端口等用于服务治理的信息）
#       eureka.instance.metadata-map.zone=shanghai针对元数据的zone进行配置
#       eureka.instance.instance-id 定义实例名，实例名是同一服务中不同实例的唯一标识
#   Eureka应用主页的URL配置
#       eureka.instance.home-page-url=  绝对路径配置
#       eureka.instance.home-page-url-path= 相对路径配置
#   Eureka状态页的URL配置
#       eureka.instance.status-page-url=  绝对路径配置
#       eureka.instance.status-page-url-path= 相对路径配置
#   Eureka健康检查的URL配置
#       eureka.instance.health-check-url=  绝对路径配置
#       eureka.instance.health-check-url-path= 相对路径配置
#   eureka.instance.prefer-ip-address 是否优先使用IP地址作为主机名的标识
#





