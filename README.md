# Dom file unload bug

This repo serves to reproduce a dynamic plugin bug where creating a `DomFileDescription`
which implements `getFileIcon` using an Icon within the plugin, unloading the plugin fails 
when the icon is displayed in the Project Explorer.

## Repo:

1) Launch "runIde"
2) Open this project in the sandbox
3) Open the project explorer and verify you see the `test.xml` file
4) Try to reload the plugin

You will notice reloading fails.