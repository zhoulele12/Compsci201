import java.util.*;

public class SyllableSorting {
    private class sortComp implements Comparator {
        @Override
        public int compare(Object o1, Object o2) {
            List<String> results_1 = split((String) o1);
            List<String> results_2 = split((String) o2);
            Collections.sort(results_1);
            Collections.sort(results_2);
            int index = 0;
            while (index < results_1.size() &&index<results_2.size() && results_1.get(index).compareTo(results_2.get(index)) == 0) {
                index += 1;
            }
            if(index==results_1.size() || index==results_2.size()) {
                if (results_1.size() == results_2.size()) {
                    return 0;
                } else {
                    return results_1.size() - results_2.size();
                }
            }else {
                return results_1.get(index).compareTo(results_2.get(index));
            }
        }
    }

        private class unsortComp implements Comparator {
            @Override
            public int compare(Object o1, Object o2) {
                List<String> results_1 = split((String) o1);
                List<String> results_2 = split((String) o2);

                int index = 0;
                while (index < results_1.size() && index < results_2.size()
                                && results_1.get(index).compareTo(results_2.get(index)) == 0) {
                    index += 1;
                }

                if (index == results_1.size()) {
                    return 0;
                } else {
                    return results_1.get(index).compareTo(results_2.get(index));
                }

            }
        }

        public String[] sortWords(String[] words) {
            Comparator sortComp = new sortComp();
            Comparator unsortComp = new unsortComp();
            Comparator comp = sortComp.thenComparing(unsortComp);
            Arrays.sort(words, comp);
            return words;
        }

        public List<String> split(String word) {
            List<String> ret = new ArrayList<>();
            Character[] vowels = {'a', 'e', 'i', 'o', 'u'};
            int start = 0;
            int end = 1;
            char[] chars = word.toCharArray();
            while (start != chars.length) {
                //Arrays.asList() converts chars to Characters,and .contains cannot evaluate Character vs char
                while (!Arrays.asList(vowels).contains(chars[end])) {
                    end += 1;
                }
                while (end < chars.length && Arrays.asList(vowels).contains(chars[end])) {
                    end += 1;
                }
                ret.add(String.valueOf(Arrays.copyOfRange(chars, start, end)));
                start = end;
                end += 1;
            }

            return ret;
        }
    }