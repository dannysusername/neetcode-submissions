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
            
            if(keysList.get(mid).getTimeStamp() <= timeStamp) {
                best = keysList.get(mid).getValue();
                lo = mid + 1;
            } else {
                hi = mid - 1;
            }

        }

        return best;
    }

}

class Entry {

    private String key;
    private String value;
    private int timeStamp;

    public Entry(String key, String value, int timeStamp) {
        this.key = key;
        this.value = value;
        this.timeStamp = timeStamp;
    }

    public String getValue() {
        return value;
    }

    public void setValue(String value) {
        this.value = value;
    }

    public int getTimeStamp() {
        return timeStamp;
    }

    public void setTimeStamp(int timeStamp) {
        this.timeStamp = timeStamp;
    }

    
}



