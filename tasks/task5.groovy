def int isIp(string) {

String.metaClass.isIp={
   if(org.codehaus.groovy.grails.validation.routines.InetAddressValidator.getInstance().isValidInet4Address(delegate)){
    return true;
   } else {
    return false;
    } 
}
}
return this
