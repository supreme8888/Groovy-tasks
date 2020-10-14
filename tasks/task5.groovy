import org.codehaus.groovy.grails.validation.routines.InetAddressValidator

def boolean isIp(variable) {
    return(InetAddressValidator.getInstance().isValidInet4Address(variable))
}

return this