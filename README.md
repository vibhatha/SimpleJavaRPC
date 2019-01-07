# SimpleJavaRPC
Simple RPC Java Example

# Java RPC with Juliet Cluster

## Compile
```bash
javac ReqServer.java
javac ReqClient.java
```

## Run Server

```bash
java ReqServer <port>
ex:
    java ReqServer 3000

```

## Run Client

```bash
java ReqClient <ip-address-server> <port>
ex :
    java ReqClient 172.16.0.1 3000

```
## Note

Make sure you run the server first and then client. If you are running in a single node,
please add the ip address as 127.0.0.1 and a port of your preference. Make sure to use a
port which is not used by the system. If you are running the server in one machine and the 
client in the other machine, use ifconfig command to find the ip address of the server. 

## Reference

http://surajzanvar.blogspot.com/p/program-for-remote-procedure-call-rpc.html
