class StringDifference 
{
	public static void main(String[] args) 
	{
		strDiff(args[0],args[1]);
	}
	public static void strDiff(String hear, String dear){
    String[] hr = dear.split("\n");
    for (String h : hr) {
        if (!hear.contains(h)) {
            System.err.println(h);
        }
    }
}
}
