/**
 * Once you add this file in scripts tag in html, then angular js will append this filter to app object
 */

app.filter("genderconvert",function(){
		return function(gender){
			if(gender==1){
				return "Male";
			}
			else if(gender==2){
				return "Female";
			}
			else
				return "Not Applicable";
		}
		})