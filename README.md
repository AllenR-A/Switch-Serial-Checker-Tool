# Switch-Serial-Checker-Tool
A CMSC 22 Java Project in UP Visays [Mr. Pabroquez]

My Hobby/Interest: Console Modding/Jailbreaking <br />
Problem: Can I "hack" my nintendo switch? <br />
Solution: Check using its serial number. <br />
## What is it?
It's basically the same as [these](https://ismyswitchpatched.com/) [sites](https://damota.me/ssnc/checker) but can be run offline. <br />
Since some prolly just want to know but might not have internet for some reason.<br />
Though unfortunately, some internet access might be needed as a **very useful** guide when modifying the Switch.

This has 3 options:
<br />+ Show patched status (a bit detailed)
<br />+ Show other information (based on serial number)
<br />+ Both (with patched status part shortened)

Preview:


                                          ======================================
                                           = = =Switch Serial Checker Tool= = =
                                          ======================================
                                          ======================================
                                                   Pick one from the 3:        
                                          ======================================
                                          1. Patched Switch Checker
                                          2. Other Switch Information
                                          3. All of the above
                                          (Input "1", "2", or "3")
                                          ======================================
                
## Design Patterns
[Factory](https://www.tutorialspoint.com/design_pattern/factory_pattern.htm) -> For the patch checker since all the switches' serial numbers should follow the same format.
<br />[State](https://www.tutorialspoint.com/design_pattern/state_pattern.htm) -> The state (model information) changes based on the serial number inputted.
<br />[Composite](https://www.javatpoint.com/composite-pattern) -> It'll be tree-like (models are the leaf nodes).
<br />
<br />
<br />
<br />
<br />
<br />
<br />
<br />
<br />
<br />
## For "possibly-patched" Switches
[\[gbatemp.net\] A definitive way to test if your Switch is patched or not (purchases after 07-2018)](https://gbatemp.net/threads/512018/)
## References
[Is My Switch Patched?](https://ismyswitchpatched.com/)
<br />[Switch SN Checker](https://damota.me/ssnc/checker)
<br />[\[suchmememanyskill.github.io\] Switch Serial List](https://suchmememanyskill.github.io/guides/switchserials/)
<br />[\[gbatemp.net\] Switch Informations by serial number - READ THE FIRST POST before asking questions](https://gbatemp.net/threads/481215/)
<br />[\[gbatemp.net\] Switch serial number beginning with XFL7???](https://gbatemp.net/threads/553206/)
<br />[\[gbatemp.net\] source for "lite version is also mariko"](https://gbatemp.net/posts/9157950/)
<br />[\[partitionwizard.com\] Everything You Should Know of Nintendo Switch Serial Number](https://www.partitionwizard.com/partitionmanager/switch-serial-number.html)
<br />[\[pocket-lint.com\] How to tell if you're buying the new Nintendo Switch or the old one](https://www.pocket-lint.com/games/news/nintendo/148957-how-to-tell-if-you-re-buying-the-new-or-old-nintendo-switch)
<br />[\[wololo.net\] Switch serial pic source & other references](https://wololo.net/2017/09/05/knowing-firmware-nintendo-switch-will-come/)
<br />[\[shpock.com\] 2nd Switch serial pic source (sold out)](https://www.shpock.com/en-gb/i/XucE9c1sVDk2fSwb/nintendo-switch-v2)
<br />Switch Lite image came from the thumbnail of [this video](https://youtu.be/HR3cpo4hCeQ)
##
Note:  
Using "**\<br />**" or "\_\_" (where "__" are 2 spaces after the last character)  
is how you create a new line in a README.md
