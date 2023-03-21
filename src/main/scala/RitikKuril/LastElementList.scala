package RitikKuril

object LastElementList {
    def last(list:List[Int]):Int={

        if(list.isEmpty==true)
            {
                return -1;
            }
        else if(list.length==1)
            return list.head;
        else
            last(list.tail);
    }
}
