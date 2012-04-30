//Coded by MOEEN ARSHAD

alert("This Liquid Layout Supports Both 1024x768, & 1680x1050... (along with a default).\n\n"+"Your Current Screen Resolution Is Set To: " + screen.width + " x " + screen.height + ".");
getScreen();

/*
Create a liquid layout with HTML, CSS, and Javascript. 
This layout must support the following resolutions: 1024x768, 1680x1050. 
Explain why you would use a liquid layout.

Resolutions:
1024x768
1680x1050
all else
*/

var cssFile;
function dynamicCSS(filename){
	cssFile = document.createElement("link");
	cssFile.setAttribute("rel", "stylesheet");
	cssFile.setAttribute("type", "text/css");
	cssFile.setAttribute("href", filename);
	
	
}

function getScreen(){

	var resWidth = screen.width;
	var resHeight = screen.height;
	
	if (resWidth == 1024 && resHeight == 768){
	//1024x768 Resolution
		dynamicCSS("res_1024.css");
		document.getElementsByTagName("head")[0].appendChild(cssFile);
	}
	
	else if (resWidth == 1680 && resHeight == 1050){
	//1680x1050 Resolution
		dynamicCSS("res_1680.css");
		document.getElementsByTagName("head")[0].appendChild(cssFile);
	}
	
	else{
		//load default
		dynamicCSS("res_default.css");
		document.getElementsByTagName("head")[0].appendChild(cssFile);
	}
	
}