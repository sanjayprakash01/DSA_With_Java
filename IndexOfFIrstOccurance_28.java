public class IndexOfFIrstOccurance_28 {
    int indexOfFirstOccurance(String haystack, String needle) {
        if (haystack.contains(needle)) return haystack.indexOf(needle); 
        return -1;
    }
}
