package doc;

import org.mapdb20.DB;
import org.mapdb20.DBMaker;


public class cache_hash_table {

    public static void main(String[] args) {
        //a
        DB db = DBMaker
                .memoryDB()
                .cacheHashTableEnable()
                .cacheSize(1000000)     //optionally change cache size
                .make();
        //z
    }
}
