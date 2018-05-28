String findProfession(int level, int pos) {
    
    String res = (pos%2 == 0) ? "Doctor" : "Engineer";
    
    for(int i = 1; i < level; i++)
    {
        pos = (int)Math.ceil(pos / 2.0);
        
        if(pos % 2 == 0)
        {
            
            if(res.equals("Doctor"))
                res = "Engineer";
            else
                res = "Doctor";
        }
    }

    return res;
}
