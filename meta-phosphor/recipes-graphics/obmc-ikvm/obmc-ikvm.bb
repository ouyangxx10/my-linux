SUMMARY = "OpenBMC VNC server and IKVM daemon"
DESCRIPTION = "obmc-ikvm is a vncserver for the AST2XXX video engine to allow IKVM"
LICENSE = "GPLv2"
LIC_FILES_CHKSUM = "file://LICENSE;md5=d32239bcb673463ab874e80d47fae504"

DEPENDS = "libvncserver"
RDEPENDS_${PN} += "libvncserver"

SRC_URI = "git://github.com/eddiejames/obmc-ikvm"
SRCREV = "c6288613792733ac3e2bb61289ad793287cbff89"

SRC_URI += "file://create_kbd.sh"
SRC_URI += "file://create_ptr.sh"
SRC_URI += "file://create_usbhid.sh"

PR = "r1"
PR_append = "+gitr${SRCPV}"

S = "${WORKDIR}/git"

do_install() {
    install -d ${D}${bindir}
    install -m 0755 ${WORKDIR}/create_kbd.sh ${D}${bindir}
    install -m 0755 ${WORKDIR}/create_ptr.sh ${D}${bindir}
    install -m 0755 ${WORKDIR}/create_usbhid.sh ${D}${bindir}
    install -m 0755 obmc-ikvm ${D}${bindir}
}

TARGET_CC_ARCH += "${LDFLAGS}"
