-The liquid layout handles both 1024x768 & 1680x1050 resolutions.

-There is also a default layout that loads in case the user's resolutions does not fall into either of the specified resolutions.

-I have implemented a Java Alert that notifies the user of their screen resolution at the start of the page.

-*IMPORTANT* The Question has been answered (of why would we use a liquid layout) in the html file.

-But just in case... here it is again:
	-Liquid layout's are an efficient way of utilizing the user's web browser size. Since the layout's dimensions are defined using percentages, this technique allows the layout to adapt and adjust to match the browser's size. In turn, it offers the user a comfortable level of control and flexibility. There is no way to guarantee that a user will encounter the intended U.I. at an "optimum" resolution, but this method prevents implementing horizontal scroll bars by adapting the layout to the available horizontal space without compromising the integrity of the content. All the elements remain intact and maintain their relationship in the layout. This technique is particularly useful for text-heavy pages, changes in font preference, and viewing on multiple devices.

-Coded by MOEEN ARSHAD