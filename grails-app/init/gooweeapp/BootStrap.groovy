package gooweeapp

import goowee.application.GooweeApplication
import goowee.security.SecurityService
import grails.web.servlet.mvc.GrailsHttpSession
import template.InstallService
import template.TTplCompany
import template.TTplProduct

class BootStrap {

    GooweeApplication gooweeApplication
    SecurityService securityService
    InstallService installService

    def init = {

        gooweeApplication.onInstall {
            installService.install()
        }

        gooweeApplication.onTenantInstall { String tenantId ->
            installService.tenantInstall()
        }

        gooweeApplication.onDevInstall { String tenantId ->
            installService.devInstall()
        }

        gooweeApplication.beforeInit {
            // no-op
        }

        gooweeApplication.onInit {
            gooweeApplication.registerPrettyPrinter(TTplCompany, '${it.name}')
            gooweeApplication.registerPrettyPrinter(TTplProduct, '${it.ref} - ${it.name}')

            gooweeApplication.registerCredits('Project Management', 'Gianluca Sartori')
            gooweeApplication.registerCredits('Software Development', 'Francesco Piceghello', 'Gianluca Sartori')
            gooweeApplication.registerCredits('Testing', 'Francesco Piceghello', 'Gianluca Sartori')

            // Main application features
            gooweeApplication.registerFeature(
                controller: 'tplOrder',
                icon: 'fa-flag',
                favourite: true,
            )

            // Template features as an example
            gooweeApplication.registerFeature(
                controller: 'tplTemplate',
            )
            gooweeApplication.registerFeature(
                parent: 'tplTemplate',
                controller: 'tplCompany',
                icon: 'fa-house-flag',
            )
            gooweeApplication.registerFeature(
                parent: 'tplTemplate',
                controller: 'tplProduct',
                icon: 'fa-heart',
            )
        }

        gooweeApplication.onTenantInit {
            // no-op
        }

        gooweeApplication.afterInit { String tenantId ->
            // no-op
        }

        securityService.afterLogin { String tenantId, GrailsHttpSession session ->
            // no-op
        }

        securityService.afterLogout { String tenantId ->
            // no-op
        }
    }

    def destroy = {
    }

}
