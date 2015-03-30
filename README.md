# Advanced Template for Sponge Plugins with a separate API

This template was made for essential plugins that provide common services for other plugins (e.g. economy, teleportation, minigame APIs). 

The separation of the service interfaces (API) and the plugin (implementation of the API) has several advantages:

* Other plugin developers can write their own implementation of the API
* Better separation between internal code and interfaces for other plugins
* Separate version numbers for API and Plugin

*If you just want to create a simple plugin, the [simple boilerplate][4] is the right choice!*

## Usage
1. Download this repo and copy it to your project folder
2. Rename subfolders to whatever you want. (e.g. `myplugin-plugin` and `myplugin-api`)
3. Modify to fit your needs:
 1. Change the `settings.gradle` to match your project.
 2. Change the `build.gradle` to match your project.
 3. Modify and rename the `NotifierPlugin` class located in the main project. Remember to change the `@Plugin`-Annotation on line 37.
 4. Change the packet structure to your own. Currently it is `com.github.spbp.notifier` which is simply the domain and user reversed. If you want to find out more about naming conventions go here: [Code Conventions (Oracle.com)][1]. Do this on both the main and the API subprojects.
 5. The template comes with the MIT License, a very simple open-source license. If you want, [choose a different License][2] for your project and modify the `HEADER.TXT` and `LICENSE.TXT` files.
 6. 
4. Build:
 1. Open a CLI of your choice in the root project folder.
 2. Run `gradlew build` or `./gradlew build` if you're on a *nix system.
 3. You will find the resulting JAR-files in a folder named `build/libs` inside the projects root directory.

For support see the related [thread][3] on the Sponge Forums.

[1]: http://docs.oracle.com/javase/tutorial/java/package/namingpkgs.html
[2]: http://choosealicense.com
[3]: https://forums.spongepowered.org/t/boilerplate-for-plugins-with-api-implementation/6264
[4]: https://github.com/spbp/simple-boilerplate
