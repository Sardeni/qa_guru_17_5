package com.sardeni;

import java.util.HashMap;
import java.util.Map;

public class Main {
    public static void main(String[] args) {

        ListExample list = new ListExample();
        list.addToList(100);
        list.searchListItem(57);
        list.deleteListItem(351);

        MapExample map = new MapExample();
        map.addToMap(50);
        map.searchMapItem(30);
        map.deleteMapItem(15);

        SetExample set = new SetExample();
        set.addToSet(56);
        set.searcSetItem(21);
        set.deleteSetItem(980);

        QueueExample queue = new QueueExample();
        queue.addItemToQueue(50);
        queue.searchLQueueItem(31);
        queue.deleteQueueItem(351);

    }
}