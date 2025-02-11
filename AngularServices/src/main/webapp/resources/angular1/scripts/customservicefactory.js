/**
 * 
 */


customapp.factory('stringService',function(){
	return {
		processString: function(src){
			if(!src){
				return src;
			}
			
			var output="";
			for(i=0;i<src.length;i++){
				if(i>0&& src[i]==src[i].toUpperCase()){
					output=output+" ";
				}
				output=output+src[i];
			}
			
			return output;
		}
	}
});