//package Coding;
//
//import java.util.*;
//import java.util.stream.Collectors;
//
//public class Recent
//{
//
//    public static List<String> recentItems(List<String> logs)
//    {
//        HashSet<String> recentlyViewed = new HashSet<>();
//        List<String> listOfRecentlyViewed = new ArrayList<>();
//
//        for(String log : logs)
//        {
//            if(recentlyViewed.contains(log))
//            {
//                listOfRecentlyViewed.remove(log);
//                listOfRecentlyViewed.add(0, log);
//            }
//            else
//            {
//                recentlyViewed.add(log);
//                listOfRecentlyViewed.add(0, log);
//            }
//        }
//
//        return listOfRecentlyViewed;
//    }
//
//
//    public static int[] nextGreaterElement(int[] nums1, int[] nums2) {
//
//        HashMap<Integer, Integer> map = new HashMap();
//        int[] result = new int[nums1.length];
//        for(int i = 0; i + 1 < nums2.length; i++)
//        {
//            for(int j = i+1; j < nums2.length; j++)
//            {
//                if(nums2[j] > nums2[i])
//                {
//                    map.put(nums2[i], nums2[j]);
//                    break;
//                }
//                map.put(nums2[i], -1);
//
//            }
//
//        }
//        map.put(nums2[nums2.length -1], -1);
//
//        for(int i = 0; i< nums1.length; i++)
//        {
//            if(map.containsKey(nums1[i]))
//                result[i] = map.get(nums1[i]);
//        }
//
//        return result;
//    }
//
//    protected static void backtrack(
//            int remain,
//            LinkedList<Integer> comb,
//            int start, int[] candidates,
//            List<List<Integer>> results) {
//
//        if (remain == 0) {
//            // make a deep copy of the current combination
//            results.add(new ArrayList<Integer>(comb));
//            return;
//        } else if (remain < 0) {
//            // exceed the scope, stop exploration.
//            return;
//        }
//
//        for (int i = start; i < candidates.length; ++i) {
//            // add the number into the combination
//            comb.add(candidates[i]);
//            backtrack(remain - candidates[i], comb, i, candidates, results);
//            // backtrack, remove the number from the combination
//            comb.removeLast();
//        }
//    }
//
//    public static List<List<Integer>> combinationSum(int[] candidates, int target) {
//        List<List<Integer>> results = new ArrayList<List<Integer>>();
//        LinkedList<Integer> comb = new LinkedList<Integer>();
//
//        backtrack(target, comb, 0, candidates, results);
//        return results;
//    }
//    public static void main (String args[])
//    {
//        List<String> logs = new ArrayList<>();
//        logs.add("SmartPhone");
//        logs.add("Television");
//        logs.add("SmartPhone");
//        logs.add("Television");
//       // System.out.println(recentItems(logs));
//
//        //System.out.println(nextGreaterElement(new int[]{1,3,5,2,4}, new int[]{6,5,4,3,2,1,7}));
//        //System.out.println(combinationSum(new int[]{2,3,6,7}, 7));
//
//        HashMap<Integer,String> map = new HashMap<>();
//        List<Integer> list1 = new ArrayList<Integer>();
//        map.put(1, "Manasa");
//        map.put(2, "ABC");
//        map.put(5, "DEF");
//        map.put(192, "Manasa");
//        map.put(154, "Manasa");
//        map.put(132, "Manasa");
//        map.put(201, "Manasa");
//
//       List<Integer> set =  map.entrySet().stream().filter(entry -> entry.getValue().equalsIgnoreCase("Manasa")).map(Map.Entry::getKey).collect(
//                Collectors.toList());
//
//        List<Integer> set1 =  map.keySet().stream()
//                .filter(key -> key..equals(map.get(key)))
//                .collect(Collectors.toList());
//       Collections.sort(set);
//
//       for(int i = 0; i < set.size() - 1; i++)
//       {
//           if(map.containsKey(set.get(i)))
//               map.remove(set.get(i));
//       }
//
//       System.out.println(map);
//
////        Map<String, ArrayList<Integer>> reverseMap = new HashMap<>(
////                map.entrySet().stream()
////                        .collect(Collectors.groupingBy(Map.Entry::getValue)).values().stream()
////                        .collect(Collectors.toMap(
////                                item -> item.get(0).getValue(),
////                                item -> new ArrayList<>(
////                                        item.stream()
////                                                .map(Map.Entry::getKey)
////                                                .collect(Collectors.toList())
////                                ))
////                        ));
////
////        System.out.println(reverseMap);
//
//    }
//}
