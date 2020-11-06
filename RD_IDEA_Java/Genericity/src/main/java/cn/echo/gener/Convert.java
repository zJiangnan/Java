package cn.echo.gener;

/**
 * @ClassName : Convert
 * @Author : Jiangnan
 * @Date: 2020/10/23 10:55
 * @Description : 泛型类
 **/
public class Convert<K, V> {
    private K key;
    private V value;

    public Convert() {
    }

    public Convert(K key, V value) {
        this.key = key;
        this.value = value;
    }

    public K getKey() {
        return key;
    }

    public void setKey(K key) {
        this.key = key;
    }

    public V getValue() {
        return value;
    }

    public void setValue(V value) {
        this.value = value;
    }

    @Override
    public String toString() {
        return "Convert{" +
                "key=" + key +
                ", value=" + value +
                '}';
    }
}
