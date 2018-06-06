char * findProfession(int level, int pos) {
    
    bool isEng = (pos%2 == 0) ? false : true;
        
    for(int i = 1; i < level; i++){
        pos = (int)ceil((double)pos/2);
        
        if(pos%2 == 0)
            if(isEng)
                isEng = false;
            else
                isEng = true;
    }
    
    return isEng ? "Engineer" : "Doctor";
}
