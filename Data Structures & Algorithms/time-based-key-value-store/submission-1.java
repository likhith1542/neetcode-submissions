class TimeMap {

    private Map<String,Map<Integer,String>> tm;

    public TimeMap() {
        tm=new HashMap<String,Map<Integer,String>>();
    }
    
    public void set(String key, String value, int timestamp) {
        tm.computeIfAbsent(key, k -> new HashMap<>()).put(timestamp, value);
    }
    
    public String get(String key, int timestamp) {
        Map<Integer,String> vals=tm.get(key);

        String res="";
        for(int i=timestamp;i>=0 && vals!=null;i--){
            if(vals.containsKey(i)){
                res=vals.get(i);
                break;
            }
        }

        return res;
    }
}
