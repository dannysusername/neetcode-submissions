

class TimeMap {
    private HashMap<String, List<Entry>> timeMap;

    public TimeMap() {
        timeMap = new HashMap<>();

    }

    public void set(String key, String value, int timeStamp) {
        Entry entry = new Entry(key, value, timeStamp);
        timeMap.computeIfAbsent(key, k -> new ArrayList<>()).add(entry);
        

    }

    public String get(String key, int timeStamp) {
        List<Entry> keysList = timeMap.get(key);
        if (keysList == null) return "";

        int lo = 0;
        int hi = keysList.size() - 1;
        String best = "";

        while(lo <= hi) {
            int mid = lo + (hi - lo) / 2;
            
            if(keysList.get(mid).timeStamp <= timeStamp) {
                best = keysList.get(mid).value;
                lo = mid + 1;
            } else {
                hi = mid - 1;
            }

        }

        return best;
    }
    public static void main(String[] args) {

    }

}

class Entry {

    final String key;
    final String value;
    final int timeStamp;

    public Entry(String key, String value, int timeStamp) {
        this.key = key;
        this.value = value;
        this.timeStamp = timeStamp;
    }

   
    
}