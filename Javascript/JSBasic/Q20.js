function newList(A, num) {
    var list = [];
    for (var i=0;i<A.length;++i) {
    list.push(A[i]);
    list.push(num[i]);
    }
    return list;
    }
    console.log(newList(['x','y','z'],[1,2,3]));
    
    