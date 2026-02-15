package Leetcode;

import java.util.ArrayDeque;
import java.util.Deque;

public class MaxXor {
    public static void main(String[] args) {
        int[] arr = {5, 4, 5, 6};
        int k = 2;
        int ans = maxXor(arr, k);
        System.out.println(ans);
    }

    static class TrieNode {
        TrieNode[] child = new TrieNode[2];
        int count = 0; // number of prefixes passing through
    }

    static class Trie {
        TrieNode root = new TrieNode();

        void insert(int num) {
            TrieNode node = root;
            for (int i = 14; i >= 0; i--) {
                int bit = (num >> i) & 1;
                if (node.child[bit] == null)
                    node.child[bit] = new TrieNode();
                node = node.child[bit];
                node.count++;
            }
        }

        void remove(int num) {
            TrieNode node = root;
            for (int i = 14; i >= 0; i--) {
                int bit = (num >> i) & 1;
                node = node.child[bit];
                node.count--;
            }
        }

        int queryMaxXor(int num) {
            TrieNode node = root;
            int maxXor = 0;

            for (int i = 14; i >= 0; i--) {
                int bit = (num >> i) & 1;
                int opposite = 1 - bit;

                if (node.child[opposite] != null && node.child[opposite].count > 0) {
                    maxXor |= (1 << i);
                    node = node.child[opposite];
                } else {
                    node = node.child[bit];
                }
            }
            return maxXor;
        }
    }

    public static int maxXor(int[] nums, int k) {
        int n = nums.length;
        int left = 0;
        int maxXor = 0;

        Trie trie = new Trie();

        Deque<Integer> minDeque = new ArrayDeque<>();
        Deque<Integer> maxDeque = new ArrayDeque<>();

        int prefixXor = 0;
        trie.insert(0); // prefix before start

        for (int right = 0; right < n; right++) {

            prefixXor ^= nums[right];

            // maintain max deque
            while (!maxDeque.isEmpty() && nums[maxDeque.peekLast()] <= nums[right])
                maxDeque.pollLast();
            maxDeque.offerLast(right);

            // maintain min deque
            while (!minDeque.isEmpty() && nums[minDeque.peekLast()] >= nums[right])
                minDeque.pollLast();
            minDeque.offerLast(right);

            // shrink window if invalid
            while (nums[maxDeque.peekFirst()] - nums[minDeque.peekFirst()] > k) {

                if (maxDeque.peekFirst() == left)
                    maxDeque.pollFirst();
                if (minDeque.peekFirst() == left)
                    minDeque.pollFirst();

                left++;
            }

            // remove prefixes that are no longer valid
            // We maintain prefix XORs aligned with window
            // Insert current prefix
            maxXor = Math.max(maxXor, trie.queryMaxXor(prefixXor));
            trie.insert(prefixXor);
        }

        return maxXor;
    }
}
