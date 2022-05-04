package kenneth.app.starlightlauncher.utils

import kenneth.app.starlightlauncher.MainActivity
import kenneth.app.starlightlauncher.databinding.ActivityMainBinding
import kenneth.app.starlightlauncher.databinding.SearchResultLayoutBinding
import kenneth.app.starlightlauncher.databinding.WidgetsPanelBinding
import kenneth.app.starlightlauncher.searching.views.SearchResultView

/**
 * A class that stores references of view bindings of different views/activities
 */
internal object BindingRegister {
    var mainActivity: MainActivity? = null

    /**
     * View binding of MainActivity
     */
    lateinit var activityMainBinding: ActivityMainBinding

    /**
     * View binding of widgets panel
     */
    lateinit var widgetsPanelBinding: WidgetsPanelBinding

    /**
     * View binding of search_result_layout, inflated by [SearchResultView].
     */
    lateinit var searchResultViewBinding: SearchResultLayoutBinding
}