DESCRIPTION = "libvncserver - A library implementing the VCN protocol"
HOMEPAGE = "https://github.com/LibVNC/libvncserver"
LICENSE = "GPLv2"
LIC_FILES_CHKSUM = "file://COPYING;md5=361b6b837cad26c6900a926b62aada5f"
PR = "r1"
PR_append = "+gitr${SRCPV}"
DEPENDS += "jpeg libpng openssl"
SRC_URI = "git://github.com/LibVNC/libvncserver"
SRCREV = "1781ecda341fb06fd414a4d84bb363b070958ea4"
S = "${WORKDIR}/git"

inherit cmake
