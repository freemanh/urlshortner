# urlshortner

生成短链接的小程序。

该程序不能直接用于生产，很多代码只是测试主要实现方式。比如id的生成，如果考虑到大规模分布式应用，建议用Redis的INCR命名进行原子增加。另外数据存储部分
只是简单使用了一个hash map在内存中保存。
