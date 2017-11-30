<pre>Конспект Борисова - Спринг потрошитель

Бенчмарки (nsec)
Look up
map.get("x")                5.7
context.getBean("x")        72
context.getBean(x.class)    91

Creation
new             3.3
newInstance     5.6
xml             700
xml + BPP       2100
annotations     2100
java config     5100
groovy          700

Injection
xml             700
xml + BPP       900
annotations     150
java config     3000
groovy          700

Proxy
without         3.3
cglib           4000
Dynamic proxy   1813

invoke with proxy
without         3.3
cglib           10
Dynamic Proxy   10
Аспект          250
</pre>