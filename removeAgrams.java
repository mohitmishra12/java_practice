//import java.util.ArrayList;
//import java.util.List;
//import java.util.*;
//
//class removeAgrams {
//    public List<String> removeAnagrams(String[] words) {
//        List<String> result = new ArrayList<>();
//        if (words == null || words.length == 0) {
//            return result;
//        }
//        int uniqueWordIdx = 0;
//        int currIdx = 1;
//        result.add(words[uniqueWordIdx]);
//        while (currIdx < words.length) {
//            if (!isAnagrams(words[currIdx], words[uniqueWordIdx])) {
//                uniqueWordIdx = currIdx;
//                result.add(words[uniqueWordIdx]);
//            }
//            currIdx++;
//        }
//        return result;
//    }
//}
