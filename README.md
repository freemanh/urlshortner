# urlshortner

生成短链接的小程序。

该程序不能直接用于生产，很多代码只是测试主要实现方式。比如id的生成，如果考虑到大规模分布式应用，建议用Redis的INCR命令进行原子增加。另外数据存储部分
只是简单使用了一个hash map在内存中保存。

生成短链接主要有一个关键问题要解决：如何把任意长度的，不相同的url转换成长度可控的（可能是6位）字符。一般有两种方案：
- 使用hash算法，将不同长度的字符串转换成等长的字符串。比如MD5。
- 对不同的url生成自增的序列号，然后将序列号用base 64或者base 62等方式，转换成较短的表达

使用hash算法因为可能存在重复，并且通常长度也比较长，不适合该业务场景。

How to use：
```java
java com.xxx.urlshortener.Application http://www.sohu.com http://www.163.com
```


