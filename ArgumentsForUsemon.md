  * Difficult to argument and create a good business case to support buying one of the commercial tools
  * We could not afford to create any compile or build time dependencies to the monitoring system
    * Too expensive to rebuild/redeploy old applications
  * We needed something so light weight that it could be run in our production system 24/7 365 days a year
  * We needed a system that could discover our runtime dependencies
    * Across Java method invocations and asynchronous JMS Queues
  * We only need to monitor the key traffic points in our system, not all Classes in our JVMs
    * Public methods on EJBs, Servlets, MDBs and custom defined POJOs
    * And also classes implementing the SqlStatement, MessageSender and TopicSender interfaces