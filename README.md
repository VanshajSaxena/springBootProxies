>  A Simple Proxy Implementation using Java Reflection API

---

This is a simple project that helped me learn about Java Reflection API, and how Proxying is done using some `InvocationHandler`. This does not do anything more that implementing InvocationHandler and Proxying a class.

With this I learned how Frameworks like Spring do their Inversion of Control (IoC) and Dependency Injection (DI) using Proxies and Reflection.

``` shell
src
├── main
│   ├── java
│   │   └── org
│   │       └── example
│   │           ├── App.java
│   │           └── classes
│   │               ├── Man.java
│   │               ├── Person.java
│   │               └── PersonInvocationHandler.java # InvocationHandler
```
