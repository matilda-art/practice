import javafx.scene.layout.Priority;

import java.util.*;

/**
 * @program: 前K个高频单词
 * @description
 * 给一非空的单词列表，返回前 k 个出现次数最多的单词。
 * 返回的答案应该按单词出现频率由高到低排序。如果不同的单词有相同出现频率，按字母顺序排序。
 * @author: matilda
 * @create: 2020-05-29 17:10
 **/
public class Solution {
    public List<String> topKFrequent(String[] words, int k) {
        Map<String,Integer> map = new HashMap<>();
        //建立哈希表
        for (String word: words) {
            map.put(word,map.getOrDefault(word,0)+1);
        }

        //小根堆
        PriorityQueue<String> queue = new PriorityQueue<>(new Comparator<String>() {
            @Override
            public int compare(String o1, String o2) {
                return map.get(o1).equals(map.get(o2)) ? o2.compareTo(o1) : map.get(o1) - map.get(o2);
            }
        });

        for (String str:map.keySet()) {
            queue.offer(str);
            if (queue.size() > k){
                queue.poll();
            }
        }

        List<String> list = new ArrayList<>();
        Stack<String> stack = new Stack<>();
        while (!queue.isEmpty()){
            stack.push(queue.poll());
            list.add(queue.poll());
        }

        while (!stack.isEmpty()){
            list.add(stack.pop());
        }
        return list;
    }
}
