class Trie {

    private TrieNode root;
    
    public Trie() {
        root = new TrieNode('\0');
    }
    
    public void insert(String word) {
        TrieNode curr = root;
        for(int i = 0; i < word.length(); i++){
            char c = word.charAt(i);
            if (curr.children[c - 'a'] == null){
                curr.children[c - 'a'] = new TrieNode(c);
            }
            
            curr = curr.children[c-'a'];            
        }
        
        curr.isWord = true;
    }
    
    public boolean search(String word) {
        TrieNode curr = root;
        for(int i = 0; i < word.length(); i++){
            char c = word.charAt(i);
            
            if (curr.children[c - 'a'] != null){
                curr = curr.children[c-'a'];
            } else {
                return false;
            }
        }
        
        return curr.isWord;
    }
    
    public boolean startsWith(String prefix) {
        TrieNode curr = root;
        for(int i = 0; i < prefix.length(); i++){
            char c = prefix.charAt(i);
            
            if (curr.children[c - 'a'] != null){
                curr = curr.children[c-'a'];
            } else {
                return false;
            }
        }
        
        return true;
    }
    
    class TrieNode {
        
        public char c;
        public boolean isWord;
        public TrieNode children[];
        
        
        public TrieNode(char c) {
            this.c = c;
            this.isWord = false;
            this.children = new TrieNode[26];
        }
    }
}

/**
 * Your Trie object will be instantiated and called as such:
 * Trie obj = new Trie();
 * obj.insert(word);
 * boolean param_2 = obj.search(word);
 * boolean param_3 = obj.startsWith(prefix);
 */