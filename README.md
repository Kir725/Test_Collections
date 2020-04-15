# Test_Collections
Lists:
=============================================
LinkedList лучше использовать если требуется:
Вставка, удаление в начале списка - происходит за постоянное время в отличии от ArrayList т.к нет нужды перестраивать/увеличивать массив.

Array List быстрее для:
Добавления в конец, удаления из произвольного места, чтения произвольного элемента, за счет произвольного доступа -> отсутствия необходимости перебора.
Вставка/удаление, элемента из середины исходя из результатов теста.

Sets: использовать если необходима уникальность елементов и нет необходимости в произвольном доступе.
=============================================
HashSet, LinkedHashSet: Добавление, Удаление, Поиск быстрее за счет хеш-структуры

HashSet по результатам теста в среднем быстрее, подходит если важна максимальная производительность и не важен порядок

LinkedHashSet использовать если важно сохранения порядка добаления элементов

TreeSet - медленне во всех операциях т.к медленне доступ по древовидной структуре, использовать если требуется хранить элементы отсортированными

Map:
=============================================
HashMap, LinkedHashMap: Добавление, Удаление, Поиск быстрее за счет хеш-структуры.

LinkedHashMap сохраняет порядок добавления пар, но опять же немного медленнее чем HashMap.

TreeMap медленнее т.к ключи расположенны в Красно Черном дереве -> тратится время на обход, использовать
если требуется хранить ключи в отсортированном порядке.

# Результаты:

## List
### Add to end for 50000 iterations
ArrayList Add to end: 4475100 ns

LinkedList Add to end: 4870200 ns

ArrayList is faster

### Add to end for 500000 iterations
ArrayList Add to end: 12307300 ns

LinkedList Add to end: 117364600 ns

ArrayList is faster

### Add to end for 5000000 iterations
ArrayList Add to end: 187515100 ns

LinkedList Add to end: 1301404100 ns

ArrayList is faster

### Insert to begin for 5000 iterations
ArrayList Insert to begin: 188323800 ns

LinkedList Insert to begin: 1325700 ns

LinkedList is faster

### Insert to begin for 10000 iterations
ArrayList Insert to begin: 351914200 ns

LinkedList Insert to begin: 269700 ns

LinkedList is faster

### Insert to begin for 50000 iterations
ArrayList Insert to begin: 1930857600 ns

LinkedList Insert to begin: 5904500 ns

LinkedList is faster

### Insert to middle for 5000 iterations
ArrayList Insert to middle: 80337600 ns

LinkedList Insert to middle: 802561600 ns

ArrayList is faster

### Insert to middle for 50000 iterations
ArrayList Insert to middle: 886570600 ns

LinkedList Insert to middle: 9714812700 ns

ArrayList is faster

### Insert to middle for 100000 iterations
ArrayList Insert to middle: 1970251800 ns

LinkedList Insert to middle: 24610274000 ns

ArrayList is faster

### Get Random for 1000 iterations
ArrayList Get Random: 773400 ns

LinkedList Get Random: 82904400 ns

ArrayList is faster

### Get Random for 5000 iterations
ArrayList Get Random: 252400 ns

LinkedList Get Random: 409282500 ns

ArrayList is faster

### Get Random for 10000 iterations
ArrayList Get Random: 307900 ns

LinkedList Get Random: 795200100 ns

ArrayList is faster

### Remove from begin for 10000 iterations
ArrayList Remove from begin: 254578200 ns

LinkedList Remove from begin: 1352000 ns

LinkedList is faster

### Remove from begin for 50000 iterations
ArrayList Remove from begin: 1073022300 ns

LinkedList Remove from begin: 789100 ns

LinkedList is faster

### Remove from begin for 100000 iterations
ArrayList Remove from begin: 1830660100 ns

LinkedList Remove from begin: 1553500 ns

LinkedList is faster

### Remove from middle for 10000 iterations
ArrayList Remove from middle: 149068000 ns

LinkedList Remove from middle: 1577819400 ns

ArrayList is faster

### Remove from middle for 50000 iterations
ArrayList Remove from middle: 667648500 ns

LinkedList Remove from middle: 7412447000 ns

ArrayList is faster

### Remove from middle for 100000 iterations
ArrayList Remove from middle: 1150986100 ns

LinkedList Remove from middle: 11533451200 ns

ArrayList is faster

### Remove from random for 10000 iterations
ArrayList Remove from random: 150109800 ns

LinkedList Remove from random: 765915000 ns

ArrayList is faster

### Remove from random for 50000 iterations
ArrayList Remove from random: 673447000 ns

LinkedList Remove from random: 3513615300 ns

ArrayList is faster

### Remove from random for 100000 iterations
ArrayList Remove from random: 1155042800 ns

LinkedList Remove from random: 6438717800 ns

ArrayList is faster

### Remove from end for 10000 iterations
ArrayList Remove from end: 927400 ns

LinkedList Remove from end: 901600 ns

LinkedList is faster

### Remove from end for 50000 iterations
ArrayList Remove from end: 2933000 ns

LinkedList Remove from end: 4440600 ns

ArrayList is faster

### Remove from end for 100000 iterations

ArrayList Remove from end: 3995500 ns

LinkedList Remove from end: 1169200 ns

LinkedList is faster

## Sets

### Add for 50000 iterations
HashSet Add: 9614800 ns

LinkedHashSet Add: 13172200 ns

TreeSet Add: 42258400 ns

HashSet is faster

### Add for 500000 iterations
HashSet Add: 109376900 ns

LinkedHashSet Add: 121404300 ns

TreeSet Add: 428615600 ns

HashSet is faster

### Add for 5000000 iterations
HashSet Add: 1363490400 ns

LinkedHashSet Add: 1678546300 ns

TreeSet Add: 6288435100 ns

HashSet is faster

### Search Random for 50000 iterations
HashSet Search Random: 8495000 ns

LinkedHashSet Search Random: 8907400 ns

TreeSet Search Random: 42323600 ns

HashSet is faster

### Search Random for 500000 iterations
HashSet Search Random: 47548700 ns

LinkedHashSet Search Random: 48090100 ns

TreeSet Search Random: 393242500 ns

HashSet is faster

### Search Random for 5000000 iterations
HashSet Search Random: 572367900 ns

LinkedHashSet Search Random: 446935000 ns

TreeSet Search Random: 3177199800 ns

LinkedHashSet is faster

### Remove Random for 10000 iterations
HashSet Remove Random: 2735200 ns

LinkedHashSet Remove Random: 2394900 ns

TreeSet Remove Random: 8141700 ns

LinkedHashSet is faster

### Remove Random for 50000 iterations
HashSet Remove Random: 4685400 ns

LinkedHashSet Remove Random: 5258900 ns

TreeSet Remove Random: 35928900 ns

HashSet is faster

### Remove Random for 100000 iterations
HashSet Remove Random: 12587900 ns

LinkedHashSet Remove Random: 9493500 ns

TreeSet Remove Random: 70345900 ns

LinkedHashSet is faster

## Maps

### Put for 50000 iterations
HashMap Put: 34596600 ns

LinkedHashMap Put: 40506400 ns

TreeMap Put: 64318100 ns

HashMap is faster

### Put for 500000 iterations
HashMap Put: 181405500 ns

LinkedHashMap Put: 207954000 ns

TreeMap Put: 611975700 ns

HashMap is faster

### Put for 5000000 iterations
HashMap Put: 1533520200 ns

LinkedHashMap Put: 1504210400 ns

TreeMap Put: 5793216700 ns

LinkedHashMap is faster

### Get Random for 1000 iterations
HashMap Get Random: 883800 ns

LinkedHashMap Get Random: 825900 ns

TreeMap Get Random: 2360000 ns

LinkedHashMap is faster

### Get Random for 5000 iterations
HashMap Get Random: 1449500 ns

LinkedHashMap Get Random: 1613600 ns

TreeMap Get Random: 9051500 ns

HashMap is faster

### Get Random for 10000 iterations
HashMap Get Random: 3264800 ns

LinkedHashMap Get Random: 3725800 ns

TreeMap Get Random: 12755800 ns

HashMap is faster

### Remove Random for 10000 iterations
HashMap Remove Random: 6639100 ns

LinkedHashMap Remove Random: 7061400 ns

TreeMap Remove Random: 18695900 ns

HashMap is faster

### Remove Random for 50000 iterations
HashMap Remove Random: 19796800 ns

LinkedHashMap Remove Random: 19108500 ns

TreeMap Remove Random: 71332000 ns

LinkedHashMap is faster

### Remove Random for 100000 iterations
HashMap Remove Random: 25347700 ns

LinkedHashMap Remove Random: 26309100 ns

TreeMap Remove Random: 129542500 ns

HashMap is faster



