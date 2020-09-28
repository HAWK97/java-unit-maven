package com.example.demo.util;

import java.util.Collections;
import java.util.List;

public class Medium {
    public static Long median(List<Long> total) {
        long j = 0;
        if (total.size() != 0) {
            //集合排序
            Collections.sort(total);
            int size = total.size();
            if (size % 2 == 1) {
                j = total.get((size - 1) / 2);
            } else {
                //加0.0是为了把int转成double类型，否则除以2会算错
                j = (total.get(size / 2 - 1) + total.get(size / 2)) / 2;
            }
        }
        return j;
    }
}
