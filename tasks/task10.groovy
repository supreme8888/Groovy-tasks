String urlText(String s){
def html = new URL(s).getText()
return html
}

return this